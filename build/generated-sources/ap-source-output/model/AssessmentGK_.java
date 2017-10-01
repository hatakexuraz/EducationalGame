package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Score;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2017-09-22T08:15:30")
@StaticMetamodel(AssessmentGK.class)
public class AssessmentGK_ { 

    public static volatile CollectionAttribute<AssessmentGK, Score> scoreCollection;
    public static volatile SingularAttribute<AssessmentGK, String> question;
    public static volatile SingularAttribute<AssessmentGK, String> answer;
    public static volatile SingularAttribute<AssessmentGK, Integer> id;

}