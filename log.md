[[1;34mINFO[m] [1m---------------------< [0;36mcom.sismics.docs:docs-core[0;1m >---------------------[m
[[1;34mINFO[m] [1mBuilding Docs Core 1.12-SNAPSHOT                                   [2/4][m
[[1;34mINFO[m] [1m--------------------------------[ jar ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m>>> [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m > [0;1mgenerate-sources[m @ [36mdocs-core[0;1m >>>[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mjacoco-maven-plugin:0.8.9:prepare-agent[m [1m(default)[m @ [36mdocs-core[0;1m ---[m
[[1;34mINFO[m] argLine set to -javaagent:/home/xin_hao/.m2/repository/org/jacoco/org.jacoco.agent/0.8.9/org.jacoco.agent-0.8.9-runtime.jar=destfile=/home/xin_hao/.jenkins/workspace/Teedy/docs-core/target/jacoco.exec
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m<<< [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m < [0;1mgenerate-sources[m @ [36mdocs-core[0;1m <<<[m
[[1;34mINFO[m] 
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m @ [36mdocs-core[0;1m ---[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1mReactor Summary for Docs Parent 1.12-SNAPSHOT:[m
[[1;34mINFO[m] 
[[1;34mINFO[m] Docs Parent ........................................ [1;32mSUCCESS[m [  9.013 s]
[[1;34mINFO[m] Docs Core .......................................... [1;31mFAILURE[m [  9.128 s]
[[1;34mINFO[m] Docs Web Commons ................................... [1;33mSKIPPED[m
[[1;34mINFO[m] Docs Web ........................................... [1;33mSKIPPED[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1;31mBUILD FAILURE[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] Total time:  21.200 s
[[1;34mINFO[m] Finished at: 2026-05-20T11:30:28+08:00
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;31mERROR[m] Failed to execute goal [32morg.apache.maven.plugins:maven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m on project [36mdocs-core[m: [1;31mAn error has occurred in Javadoc report generation: [m
[[1;31mERROR[m] [1;31mExit code: 1[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/jpa/PaginatedList.java:10: warning: no @param for <T>[m
[[1;31mERROR[m] [1;31mpublic class PaginatedList<T> {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/ClasspathScanner.java:14: warning: no @param for <T>[m
[[1;31mERROR[m] [1;31mpublic class ClasspathScanner<T> {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/ImageDeskew.java:6: error: unknown attribute: url[m
[[1;31mERROR[m] [1;31m * <a url=http://www.jdeskew.com/>JDeskew</a>[m
[[1;31mERROR[m] [1;31m      ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:46: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:51: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:59: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:62: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:69: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * @see <a href=[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:69: error: element not closed: a[m
[[1;31mERROR[m] [1;31m * @see <a href=[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:72: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * @see <a href="http://code.google.com/p/google-authenticator" />[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:72: error: element not closed: a[m
[[1;31mERROR[m] [1;31m * @see <a href="http://code.google.com/p/google-authenticator" />[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:73: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * @see <a href="http://tools.ietf.org/id/draft-mraihi-totp-timebased-06.txt" />[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticator.java:73: error: element not closed: a[m
[[1;31mERROR[m] [1;31m * @see <a href="http://tools.ietf.org/id/draft-mraihi-totp-timebased-06.txt" />[m
[[1;31mERROR[m] [1;31m        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticatorKey.java:39: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticatorKey.java:41: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m * <p/>[m
[[1;31mERROR[m] [1;31m   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:17: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class Acl implements Loggable {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:57: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:65: warning: no comment[m
[[1;31mERROR[m] [1;31m    public PermType getPerm() {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:73: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getSourceId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:81: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getTargetId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:89: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AclType getType() {[m
[[1;31mERROR[m] [1;31m                   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:103: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setDeleteDate(Date deleteDate) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:61: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setId(String id) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:69: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setPerm(PermType perm) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:77: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setSourceId(String sourceId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:85: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setTargetId(String targetId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:93: warning: no comment[m
[[1;31mERROR[m] [1;31m    public Acl setType(AclType type) {[m
[[1;31mERROR[m] [1;31m               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclCreatedAsyncEvent.java:8: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclCreatedAsyncEvent extends AclEvent {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/listener/async/AclCreatedAsyncListener.java:16: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclCreatedAsyncListener {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AclDao.java:69: warning: no @param for type[m
[[1;31mERROR[m] [1;31m    public List<AclDto> getBySourceId(String sourceId, AclType type) {[m
[[1;31mERROR[m] [1;31m                        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AclDao.java:25: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclDao {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclDeletedAsyncEvent.java:8: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclDeletedAsyncEvent extends AclEvent {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/listener/async/AclDeletedAsyncListener.java:16: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclDeletedAsyncListener {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:10: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclDto {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:41: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:57: warning: no comment[m
[[1;31mERROR[m] [1;31m    public PermType getPerm() {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:65: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getSourceId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:73: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getTargetId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:49: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getTargetName() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:81: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getTargetType() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:45: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setId(String id) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:61: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setPerm(PermType perm) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:69: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setSourceId(String sourceId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:77: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setTargetId(String targetId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:53: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setTargetName(String targetName) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:85: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setTargetType(String targetType) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:11: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic abstract class AclEvent extends UserEvent {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:36: warning: no comment[m
[[1;31mERROR[m] [1;31m    public PermType getPerm() {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:27: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getSourceId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:45: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getTargetId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:40: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AclEvent setPerm(PermType permType) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:31: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AclEvent setSourceId(String sourceId) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:49: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AclEvent setTargetId(String targetId) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/ActionUtil.java:19: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class ActionUtil {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/action/AddTagAction.java:18: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AddTagAction extends TagAction {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:33: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AppContext {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:208: warning: no comment[m
[[1;31mERROR[m] [1;31m    public EventBus getAsyncEventBus() {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:224: warning: no comment[m
[[1;31mERROR[m] [1;31m    public FileService getFileService() {[m
[[1;31mERROR[m] [1;31m                       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:220: warning: no comment[m
[[1;31mERROR[m] [1;31m    public InboxService getInboxService() {[m
[[1;31mERROR[m] [1;31m                        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:216: warning: no comment[m
[[1;31mERROR[m] [1;31m    public IndexingHandler getIndexingHandler() {[m
[[1;31mERROR[m] [1;31m                           ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:212: warning: no comment[m
[[1;31mERROR[m] [1;31m    public EventBus getMailEventBus() {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:228: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void shutDown() {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:22: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLog {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:115: warning: no comment[m
[[1;31mERROR[m] [1;31m    public Date getCreateDate() {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:91: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getEntityClass() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:83: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getEntityId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:67: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:99: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getMessage() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:107: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuditLogType getType() {[m
[[1;31mERROR[m] [1;31m                        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:75: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getUserId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:119: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setCreateDate(Date createDate) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:95: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setEntityClass(String entityClass) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:87: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setEntityId(String entityId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:71: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setId(String id) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:103: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setMessage(String message) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:111: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setType(AuditLogType type) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:79: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setUserId(String userId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:9: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLogCriteria {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:25: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getDocumentId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:33: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getUserId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:41: warning: no comment[m
[[1;31mERROR[m] [1;31m    public boolean isAdmin() {[m
[[1;31mERROR[m] [1;31m                   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:45: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuditLogCriteria setAdmin(boolean admin) {[m
[[1;31mERROR[m] [1;31m                            ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:29: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setDocumentId(String documentId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:37: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setUserId(String userId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AuditLogDao.java:24: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLogDao {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:10: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLogDto {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:94: warning: no comment[m
[[1;31mERROR[m] [1;31m    public Long getCreateTimestamp() {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:70: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getEntityClass() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:62: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getEntityId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:46: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:86: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getMessage() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:78: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuditLogType getType() {[m
[[1;31mERROR[m] [1;31m                        ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:54: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getUsername() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:98: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setCreateTimestamp(Long createTimestamp) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:74: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setEntityClass(String entityClass) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:66: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setEntityId(String entityId) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:50: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setId(String id) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:90: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setMessage(String message) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:82: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setType(AuditLogType type) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:58: warning: no comment[m
[[1;31mERROR[m] [1;31m    public void setUsername(String username) {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/AuditLogUtil.java:16: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLogUtil {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:19: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuthenticationToken {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:108: warning: no comment[m
[[1;31mERROR[m] [1;31m    public Date getCreationDate() {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:63: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:90: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getIp() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:117: warning: no comment[m
[[1;31mERROR[m] [1;31m    public Date getLastConnectionDate() {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:99: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getUserAgent() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:72: warning: no comment[m
[[1;31mERROR[m] [1;31m    public String getUserId() {[m
[[1;31mERROR[m] [1;31m                  ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:81: warning: no comment[m
[[1;31mERROR[m] [1;31m    public boolean isLongLasted() {[m
[[1;31mERROR[m] [1;31m                   ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:112: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuthenticationToken setCreationDate(Date creationDate) {[m
[[1;31mERROR[m] [1;31m                               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:67: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuthenticationToken setId(String id) {[m
[[1;31mERROR[m] [1;31m                               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:94: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuthenticationToken setIp(String ip) {[m
[[1;31mERROR[m] [1;31m                               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:121: warning: no comment[m
[[1;31mERROR[m] [1;31m    public AuthenticationToken setLastConnectionDate(Date lastConnectionDate) {[m
[[1;31mERROR[m] [1;31m                               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AuthenticationTokenDao.java:66: error: exception not thrown: java.lang.Exception[m
[[1;31mERROR[m] [1;31m     * @throws Exception[m
[[1;31mERROR[m] [1;31m               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AuthenticationTokenDao.java:85: error: exception not thrown: java.lang.Exception[m
[[1;31mERROR[m] [1;31m     * @throws Exception[m
[[1;31mERROR[m] [1;31m               ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/totp/GoogleAuthenticatorConfig.java:85: error: self-closing element not allowed[m
[[1;31mERROR[m] [1;31m     * <p/>[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m16 errors[m
[[1;31mERROR[m] [1;31m100 warnings[m
[[1;31mERROR[m] [1;31mCommand line was: /usr/lib/jvm/java-21-openjdk-amd64/bin/javadoc -J-Duser.language= -J-Duser.country= @options @packages[m
[[1;31mERROR[m] [1;31m[m
[[1;31mERROR[m] [1;31mRefer to the generated Javadoc files in '/home/xin_hao/.jenkins/workspace/Teedy/docs-core/target/reports/apidocs' dir.[m
[[1;31mERROR[m] [1;31m[m
[[1;31mERROR[m] -> [1m[Help 1][m
[[1;31mERROR[m] 
[[1;31mERROR[m] To see the full stack trace of the errors, re-run Maven with the [1m-e[m switch.
[[1;31mERROR[m] Re-run Maven using the [1m-X[m switch to enable full debug logging.
[[1;31mERROR[m] 
[[1;31mERROR[m] For more information about the errors and possible solutions, please read the following articles:
[[1;31mERROR[m] [1m[Help 1][m http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
[[1;31mERROR[m] 
[[1;31mERROR[m] After correcting the problems, you can resume the build with the command
[[1;31mERROR[m]   [1mmvn <args> -rf :docs-core[m
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Site)
Stage "Site" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Package)
Stage "Package" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Declarative: Post Actions)
[Pipeline] archiveArtifacts
Archiving artifacts
Recording fingerprints
[Pipeline] archiveArtifacts
Archiving artifacts
[Pipeline] archiveArtifacts
Archiving artifacts
[Pipeline] junit
Recording test results
[Checks API] No suitable checks publisher found.
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
ERROR: script returned exit code 1
Finished: FAILURE