package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer {
    int SIZE = 3;
    List<? extends Machine> get();
}
