package ru.educationplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.educationplatform.entity.UserProfile;

@Repository
public interface ProfileRepository extends JpaRepository<UserProfile, Long> {
}
