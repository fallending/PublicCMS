package com.publiccms.entities.system;

// Generated 2015-6-26 18:16:53 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SystemTask generated by hbm2java
 */
@Entity
@Table(name = "system_task")
public class SystemTask implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@MyColumn(title = "任务名称")
	private String name;
	@MyColumn(title = "状态", condition = true)
	private int status;
	@MyColumn(title = "表达式")
	private String cronExpression;
	@MyColumn(title = "描述")
	private String description;
	@MyColumn(title = "任务内容")
	private String content;

	public SystemTask() {
	}

	public SystemTask(String name, int status, String cronExpression, String content) {
		this.name = name;
		this.status = status;
		this.cronExpression = cronExpression;
		this.content = content;
	}

	public SystemTask(String name, int status, String cronExpression, String description, String content) {
		this.name = name;
		this.status = status;
		this.cronExpression = cronExpression;
		this.description = description;
		this.content = content;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "cron_expression", nullable = false, length = 50)
	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "content", nullable = false, length = 500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
