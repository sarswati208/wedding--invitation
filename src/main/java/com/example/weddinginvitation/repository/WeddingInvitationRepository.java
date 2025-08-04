
package com.example.weddinginvitation.repository;

import com.example.weddinginvitation.model.WeddingInvitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeddingInvitationRepository extends JpaRepository<WeddingInvitation, Long> 
{
	
}
