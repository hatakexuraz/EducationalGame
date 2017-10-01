package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Score;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2017-09-22T08:15:30")
@StaticMetamodel(AssessmentScience.class)
public class AssessmentScience_ { 

    public static volatile CollectionAttribute<AssessmentScience, Score> scoreCollection;
    public static volatile SingularAttribute<AssessmentScience, String> question;
    public static volatile SingularAttribute<AssessmentScience, String> answer;
    public static volatile SingularAttribute<AssessmentScience, Integer> id;

}