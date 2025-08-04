package com.example.weddinginvitation.controller;

import com.example.weddinginvitation.model.WeddingInvitation;
import com.example.weddinginvitation.service.WeddingInvitationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invitations")
@CrossOrigin(origins = "*")
public class WeddingInvitationController 
{

    private final WeddingInvitationService service;

    public WeddingInvitationController(WeddingInvitationService service) 
    {
        this.service = service;
    }

    @GetMapping
    public List<WeddingInvitation> getAll()
    {
        return service.getAllInvitations();
    }

    @PostMapping
    public WeddingInvitation create(@RequestBody WeddingInvitation invitation) 
    {
        return service.createInvitation(invitation);
    }
}
