package in.devtamakuwala.i18n.spring_boot_i18n_demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_blog")
public class BlogModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String summary;
	private String content;
	private LocalDateTime created_at;

	public BlogModel() {
		super();
	}

	public BlogModel(Integer id, String title, String summary, String content, LocalDateTime created_at) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.created_at = created_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "BlogModel [id=" + id + ", title=" + title + ", summary=" + summary + ", content=" + content
				+ ", created_at=" + created_at + "]";
	}

}
