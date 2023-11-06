package ru.alekseymg.pastebox.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.alekseymg.pastebox.service.PasteboxService;
import ru.alekseymg.pastebox.api.request.PasteboxRequest;
import ru.alekseymg.pastebox.api.response.PasteboxResponse;
import ru.alekseymg.pastebox.api.response.PasteboxUrlResponse;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class PasteboxController {
    private final PasteboxService pasteboxService;

    @GetMapping("/")
    public Collection<PasteboxResponse> getPublicPasteList() {
        return pasteboxService.getFirstPublicPasteboxes();
    }

    @GetMapping("/{hash}")
    public PasteboxResponse getByHash(@PathVariable String hash) {
        return pasteboxService.getByHash(hash);
    }

    @PostMapping("/")
    public PasteboxUrlResponse add(@RequestBody PasteboxRequest request) {
        return pasteboxService.create(request);
    }
}
