package com.example.weddinginvitation.service;

import com.example.weddinginvitation.model.WeddingInvitation;
import com.example.weddinginvitation.repository.WeddingInvitationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeddingInvitationService
{

    private final WeddingInvitationRepository repository;

    public WeddingInvitationService(WeddingInvitationRepository repository)
    {
        this.repository = repository;
    }

    public List<WeddingInvitation> getAllInvitations()
    {
        return repository.findAll();
    }

    public WeddingInvitation createInvitation(WeddingInvitation invitation) 
    {
        return repository.save(invitation);
    }

    public WeddingInvitation getInvitationById(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    public void deleteInvitation(Long id)
    {
        repository.deleteById(id);
    }
}
