package com.mtechlabs.springboot.springit.model.domain.doa;

import com.mtechlabs.springboot.springit.model.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
