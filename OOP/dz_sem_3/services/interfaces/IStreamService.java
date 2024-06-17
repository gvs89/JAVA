package services.interfaces;

import data.interfaces.IStream;

import java.util.List;

public interface IStreamService {
    void sortByGroupCount(List<IStream> stream);
}
