package in.devtamakuwala.i18n.spring_boot_i18n_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.devtamakuwala.i18n.spring_boot_i18n_demo.model.BlogModel;

public interface BlogReposiroty extends JpaRepository<BlogModel, Integer> {

}
