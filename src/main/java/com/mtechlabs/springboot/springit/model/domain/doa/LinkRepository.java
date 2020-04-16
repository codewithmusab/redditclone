package com.mtechlabs.springboot.springit.model.domain.doa;

import com.mtechlabs.springboot.springit.model.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository  extends JpaRepository<Link,Long> {
}
