package dnn.service;

import dnn.common.dto.BaseDto;
import dnn.common.exception.SerException;
import dnn.dao.IDao;
import dnn.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by huanghuanlai on 16/9/3.
 */
public class ServiceImpl<Entity extends BaseEntity, Dto extends BaseDto> implements IService<Entity, Dto> {

    @Autowired
    protected IDao<Entity, Dto> dao;

    @Override
    public List<Entity> findAll() throws SerException {
        return dao.findAll();
    }

    @Override
    public List<Entity> findByPage(Dto dto) throws SerException {
        return dao.findByPage(dto);
    }

    @Override
    public Long count() throws SerException {
        return dao.count();
    }

    @Override
    public Entity findById(String id) throws SerException {
        return dao.findById(id);
    }

    @Override
    public void save(Entity entity) throws SerException {
        dao.save(entity);
    }

    @Override
    public void save(List<Entity> entities) throws SerException {
        dao.save(entities);
    }

    @Override
    public void remove(String id) throws SerException {
        dao.remove(id);
    }

    @Override
    public void remove(Entity entity)throws SerException {
        dao.remove(entity);
    }

    @Override
    public void update(Entity entity) throws SerException {
        dao.update(entity);
    }

    @Override
    public List<Entity> findByCis(Map<String, Object> conditions) throws SerException {
        return dao.findByCis(conditions);
    }

    @Override
    public List<Entity> findByFuzzy(Map<String, Object> conditions) throws SerException {
        return dao.findByFuzzy(conditions);
    }

    @Override
    public long countByCis(Map<String, Object> conditions)throws SerException {
        return dao.countByCis(conditions);
    }

    @Override
    public void UpdateByCis(Entity entity, Map<String, Object> conditions)throws SerException {
        dao.UpdateByCis(entity,conditions);
    }

    @Override
    public void removeByCis(Map<String, Object> conditions)throws SerException {
        dao.removeByCis(conditions);
    }
}
