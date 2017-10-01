package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.AssessmentGK;
import model.AssessmentScience;
import model.User;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2017-09-22T08:15:30")
@StaticMetamodel(Score.class)
public class Score_ { 

    public static volatile SingularAttribute<Score, Integer> score;
    public static volatile SingularAttribute<Score, AssessmentGK> assessmentId1;
    public static volatile SingularAttribute<Score, Integer> id;
    public static volatile SingularAttribute<Score, AssessmentScience> assessmentId;
    public static volatile SingularAttribute<Score, User> userId;

}