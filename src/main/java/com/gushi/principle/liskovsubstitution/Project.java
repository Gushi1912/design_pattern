package com.gushi.principle.liskovsubstitution;

import java.util.List;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 14:48
 */
public class Project {
    private List<Document> allDocs;

    private List<WritableDocument> writableDocs;

    public void openAll() {
        for (Document document : allDocs) {
            document.open();
        }
    }

    public void saveAll() {
        for (WritableDocument document : writableDocs) {
            document.save();
        }
    }
}
