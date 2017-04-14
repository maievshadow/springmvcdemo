package com.maiev.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by maievshabu on 2017/4/12.
 */
@Component
public class Product implements java.io.Serializable{

        private static final long serialVersionUID = 1L;
        private Long id;
        private String name;
        private String category;

        public Product() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCategory() {
                return category;
        }

        public void setCategory(String category) {
                this.category = category;
        }
}
