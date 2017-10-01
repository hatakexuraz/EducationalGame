package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MathematicsNumberOption;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2017-09-22T08:15:30")
@StaticMetamodel(MathematicsNumber.class)
public class MathematicsNumber_ { 

    public static volatile SingularAttribute<MathematicsNumber, String> question;
    public static volatile SingularAttribute<MathematicsNumber, String> answer;
    public static volatile SingularAttribute<MathematicsNumber, Integer> id;
    public static volatile CollectionAttribute<MathematicsNumber, MathematicsNumberOption> mathematicsNumberOptionCollection;

}