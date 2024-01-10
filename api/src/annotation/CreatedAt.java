package annotation; //20231130

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // RUNTIME : 프로그램 실행시점에서 해당 어노테이션 이용 가능 (*SOURCE: 컴파일 이후에는 삭제됨)
@Target(FIELD)
public @interface CreatedAt {

}
