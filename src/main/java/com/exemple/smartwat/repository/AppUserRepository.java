package com.exemple.smartwat.repository;
import com.exemple.smartwat.beans.AppUser;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
public interface AppUserRepository extends JpaRepositoryImplementation<AppUser,Integer> {
        AppUser findAppUserByUsername(String username);

        public AppUser findByUsername(String Username);
}
