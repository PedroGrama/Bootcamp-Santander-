package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private me.dio.domain.Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private me.dio.domain.Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<me.dio.domain.Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<me.dio.domain.News> news;

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

    public me.dio.domain.Account getAccount() {
        return account;
    }

    public void setAccount(me.dio.domain.Account account) {
        this.account = account;
    }

    public me.dio.domain.Card getCard() {
        return card;
    }

    public void setCard(me.dio.domain.Card card) {
        this.card = card;
    }

    public List<me.dio.domain.Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<me.dio.domain.Feature> features) {
        this.features = features;
    }

    public List<me.dio.domain.News> getNews() {
        return news;
    }

    public void setNews(List<me.dio.domain.News> news) {
        this.news = news;
    }

}