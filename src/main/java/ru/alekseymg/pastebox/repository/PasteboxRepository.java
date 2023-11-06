package ru.alekseymg.pastebox.repository;

import java.util.List;

public interface PasteboxRepository {
    PasteBoxEntity getByHash(String hash);

    List<PasteBoxEntity> getListOfPublicAndAlive(int amount);

    void add(PasteBoxEntity pasteBoxEntity);
}
