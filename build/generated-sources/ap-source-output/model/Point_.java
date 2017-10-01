package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.GKChapter;
import model.User;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2017-09-22T08:15:30")
@StaticMetamodel(Point.class)
public class Point_ { 

    public static volatile SingularAttribute<Point, GKChapter> chapterId;
    public static volatile SingularAttribute<Point, Integer> id;
    public static volatile SingularAttribute<Point, User> userId;
    public static volatile SingularAttribute<Point, Integer> point;

}