# deephearing-android-sample

## Maven 저장소 설정

`gradle.properties` 파일에서 Maven 저장소 계정을 설정합니다.

```groovy
mavenUser=YOUR_MAVEN_ID
mavenPassword=YOUR_MAVEN_PASSWORD
```

## SDK Key 설정

`MainActivity`의 SDK_KEY를 설정합니다.

```java
public class MainActivity extends AppCompatActivity {
    private final String SDK_KEY = "YOUR_SDK_KEY";

    // Some code..
}
```
