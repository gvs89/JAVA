package services.interfaces;

import data.classes.EducationGroup;

public interface IGroupService {
    String saveGroupToTxt(String fileName, EducationGroup group);

    EducationGroup loadGroupFromTxt(String fileName);
}
