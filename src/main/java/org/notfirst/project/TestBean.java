package org.notfirst.project;

public class TestBean {
    private String name;

    public TestBean() {
        this.name = "TestBean";
    }

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
