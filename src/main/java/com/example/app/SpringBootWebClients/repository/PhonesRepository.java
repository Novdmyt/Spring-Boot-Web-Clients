package com.example.app.SpringBootWebClients.repository;

import com.example.app.SpringBootWebClients.entity.Phone;
import com.example.app.SpringBootWebClients.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class PhonesRepository {

    private static final Logger LOGGER =
            Logger.getLogger(PhonesRepository.class.getName());

    List<Phone> list;

    public List<Phone> getPhones() throws IOException {

        File jsonFile = new ClassPathResource(Constants.URL_FILES +
                Constants.FILE_RESORTS).getFile();
        String path = jsonFile.getAbsolutePath();

        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            list = gson.fromJson(reader,
                    new TypeToken<List<Phone>>() {}.getType());
            reader.close();
            return list.stream()
                    .map(client -> new Phone(client.getId(),
                            Constants.URL_IMAGES +
                            client.getImg())).toList();
        } catch (Exception ex) {
            LOGGER.info("PhonesRepository msg: " + ex.getMessage());
            return Collections.emptyList();
        }
    }
}
