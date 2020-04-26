package com.itlike.service;

import com.itlike.domain.Hero;
import com.itlike.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<Hero> getAllHero() {
        return heroMapper.selectAll();
    }

    @Override
    public void insertHero(Hero hero) {
        heroMapper.insert(hero);
    }

    @Override
    public Hero getOneHero(Integer id) {

        return heroMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateHero(Hero hero) {
        heroMapper.updateByPrimaryKey(hero);
    }

    @Override
    public void deleteHero(Integer id) {
        heroMapper.deleteByPrimaryKey(id);
    }

}
