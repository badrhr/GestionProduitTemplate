package org.xproce.demoadvanced.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.demoadvanced.dao.entities.Command;

public interface CommandRepository extends JpaRepository<Command, Integer>  {
}
