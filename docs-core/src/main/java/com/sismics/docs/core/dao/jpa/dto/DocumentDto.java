package com.sismics.docs.core.dao.jpa.dto;

import javax.persistence.Id;

/**
 * Document DTO.
 *
 * @author bgamard 
 */
public class DocumentDto {
    /**
     * Document ID.
     */
    @Id
    private String id;
    
    /**
     * Title.
     */
    private String title;
    
    /**
     * Description.
     */
    private String description;
    
    /**
     * Language.
     */
    private String language;
    
    /**
     * Creation date.
     */
    private Long createTimestamp;
    
    /**
     * Shared status.
     */
    private Boolean shared;

    /**
     * File count.
     */
    private Integer fileCount;
    
    /**
     * Getter de id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter de id.
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter de title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter de title.
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter de description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter de description.
     *
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter de createTimestamp.
     *
     * @return the createTimestamp
     */
    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Setter of createTimestamp.
     *
     * @param createTimestamp createTimestamp
     */
    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * Getter of shared.
     *
     * @return the shared
     */
    public Boolean getShared() {
        return shared;
    }

    /**
     * Setter of shared.
     *
     * @param shared shared
     */
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * Getter of language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter of language.
     *
     * @param language language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter of fileCount.
     * @return fileCount
     */
    public Integer getFileCount() {
        return fileCount;
    }

    /**
     * Setter of fileCount.
     * @param fileCount fileCount
     */
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }
}
