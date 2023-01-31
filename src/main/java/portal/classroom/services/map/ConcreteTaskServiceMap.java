package portal.classroom.services.map;

import org.springframework.stereotype.Service;
import portal.classroom.model.ConcreteTask;
import portal.classroom.services.interfaces.CrudService;

import java.util.Set;

@Service
public class ConcreteTaskServiceMap extends AbstractMapService<ConcreteTask, Long> implements CrudService<ConcreteTask, Long> {
    @Override
    public Set<ConcreteTask> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ConcreteTask object) {
        super.delete(object);
    }

    @Override
    public ConcreteTask findById(Long id) {
      return   super.findByID(id);
    }

    @Override
    public ConcreteTask save(ConcreteTask object) {
        return super.save(object);
    }
}
