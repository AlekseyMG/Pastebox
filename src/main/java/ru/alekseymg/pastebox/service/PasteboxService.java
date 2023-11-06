package ru.alekseymg.pastebox.service;

import ru.alekseymg.pastebox.api.request.PasteboxRequest;
import ru.alekseymg.pastebox.api.response.PasteboxResponse;
import ru.alekseymg.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public interface PasteboxService {
    PasteboxResponse getByHash(String hash);
    List<PasteboxResponse> getFirstPublicPasteboxes();
    PasteboxUrlResponse create(PasteboxRequest request);
}
