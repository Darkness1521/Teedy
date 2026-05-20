+ mvn javadoc:javadoc
[[1;34mINFO[m] Scanning for projects...
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1mReactor Build Order:[m
[[1;34mINFO[m] 
[[1;34mINFO[m] Docs Parent                                                        [pom]
[[1;34mINFO[m] Docs Core                                                          [jar]
[[1;34mINFO[m] Docs Web Commons                                                   [jar]
[[1;34mINFO[m] Docs Web                                                           [war]
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--------------------< [0;36mcom.sismics.docs:docs-parent[0;1m >--------------------[m
[[1;34mINFO[m] [1mBuilding Docs Parent 1.12-SNAPSHOT                                 [1/4][m
[[1;34mINFO[m] [1m--------------------------------[ pom ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m>>> [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m > [0;1mgenerate-sources[m @ [36mdocs-parent[0;1m >>>[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mjacoco-maven-plugin:0.8.9:prepare-agent[m [1m(default)[m @ [36mdocs-parent[0;1m ---[m
[[1;34mINFO[m] argLine set to -javaagent:/home/xin_hao/.m2/repository/org/jacoco/org.jacoco.agent/0.8.9/org.jacoco.agent-0.8.9-runtime.jar=destfile=/home/xin_hao/.jenkins/workspace/Teedy/target/jacoco.exec
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m<<< [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m < [0;1mgenerate-sources[m @ [36mdocs-parent[0;1m <<<[m
[[1;34mINFO[m] 
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m @ [36mdocs-parent[0;1m ---[m
[[1;34mINFO[m] Skipping org.apache.maven.plugins:maven-javadoc-plugin:3.12.0:javadoc report goal
[[1;34mINFO[m] 
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
[[1;33mWARNING[m] Javadoc Warnings
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/jpa/PaginatedList.java:10: warning: no @param for <T>
[[1;33mWARNING[m] public class PaginatedList<T> {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/util/ClasspathScanner.java:14: warning: no @param for <T>
[[1;33mWARNING[m] public class ClasspathScanner<T> {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:17: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class Acl implements Loggable {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:57: warning: no comment
[[1;33mWARNING[m] public String getId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:65: warning: no comment
[[1;33mWARNING[m] public PermType getPerm() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:73: warning: no comment
[[1;33mWARNING[m] public String getSourceId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:81: warning: no comment
[[1;33mWARNING[m] public String getTargetId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:89: warning: no comment
[[1;33mWARNING[m] public AclType getType() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:103: warning: no comment
[[1;33mWARNING[m] public void setDeleteDate(Date deleteDate) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:61: warning: no comment
[[1;33mWARNING[m] public void setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:69: warning: no comment
[[1;33mWARNING[m] public void setPerm(PermType perm) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:77: warning: no comment
[[1;33mWARNING[m] public void setSourceId(String sourceId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:85: warning: no comment
[[1;33mWARNING[m] public void setTargetId(String targetId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/Acl.java:93: warning: no comment
[[1;33mWARNING[m] public Acl setType(AclType type) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclCreatedAsyncEvent.java:8: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclCreatedAsyncEvent extends AclEvent {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/listener/async/AclCreatedAsyncListener.java:16: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclCreatedAsyncListener {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AclDao.java:69: warning: no @param for type
[[1;33mWARNING[m] public List<AclDto> getBySourceId(String sourceId, AclType type) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AclDao.java:25: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclDao {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclDeletedAsyncEvent.java:8: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclDeletedAsyncEvent extends AclEvent {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/listener/async/AclDeletedAsyncListener.java:16: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclDeletedAsyncListener {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:10: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclDto {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:41: warning: no comment
[[1;33mWARNING[m] public String getId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:57: warning: no comment
[[1;33mWARNING[m] public PermType getPerm() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:65: warning: no comment
[[1;33mWARNING[m] public String getSourceId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:73: warning: no comment
[[1;33mWARNING[m] public String getTargetId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:49: warning: no comment
[[1;33mWARNING[m] public String getTargetName() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:81: warning: no comment
[[1;33mWARNING[m] public String getTargetType() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:45: warning: no comment
[[1;33mWARNING[m] public void setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:61: warning: no comment
[[1;33mWARNING[m] public void setPerm(PermType perm) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:69: warning: no comment
[[1;33mWARNING[m] public void setSourceId(String sourceId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:77: warning: no comment
[[1;33mWARNING[m] public void setTargetId(String targetId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:53: warning: no comment
[[1;33mWARNING[m] public void setTargetName(String targetName) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AclDto.java:85: warning: no comment
[[1;33mWARNING[m] public void setTargetType(String targetType) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:11: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public abstract class AclEvent extends UserEvent {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:36: warning: no comment
[[1;33mWARNING[m] public PermType getPerm() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:27: warning: no comment
[[1;33mWARNING[m] public String getSourceId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:45: warning: no comment
[[1;33mWARNING[m] public String getTargetId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:40: warning: no comment
[[1;33mWARNING[m] public AclEvent setPerm(PermType permType) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:31: warning: no comment
[[1;33mWARNING[m] public AclEvent setSourceId(String sourceId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/event/AclEvent.java:49: warning: no comment
[[1;33mWARNING[m] public AclEvent setTargetId(String targetId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/ActionUtil.java:19: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class ActionUtil {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/action/AddTagAction.java:18: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AddTagAction extends TagAction {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:33: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AppContext {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:208: warning: no comment
[[1;33mWARNING[m] public EventBus getAsyncEventBus() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:224: warning: no comment
[[1;33mWARNING[m] public FileService getFileService() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:220: warning: no comment
[[1;33mWARNING[m] public InboxService getInboxService() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:216: warning: no comment
[[1;33mWARNING[m] public IndexingHandler getIndexingHandler() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:212: warning: no comment
[[1;33mWARNING[m] public EventBus getMailEventBus() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/context/AppContext.java:228: warning: no comment
[[1;33mWARNING[m] public void shutDown() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:22: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuditLog {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:115: warning: no comment
[[1;33mWARNING[m] public Date getCreateDate() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:91: warning: no comment
[[1;33mWARNING[m] public String getEntityClass() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:83: warning: no comment
[[1;33mWARNING[m] public String getEntityId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:67: warning: no comment
[[1;33mWARNING[m] public String getId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:99: warning: no comment
[[1;33mWARNING[m] public String getMessage() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:107: warning: no comment
[[1;33mWARNING[m] public AuditLogType getType() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:75: warning: no comment
[[1;33mWARNING[m] public String getUserId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:119: warning: no comment
[[1;33mWARNING[m] public void setCreateDate(Date createDate) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:95: warning: no comment
[[1;33mWARNING[m] public void setEntityClass(String entityClass) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:87: warning: no comment
[[1;33mWARNING[m] public void setEntityId(String entityId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:71: warning: no comment
[[1;33mWARNING[m] public void setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:103: warning: no comment
[[1;33mWARNING[m] public void setMessage(String message) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:111: warning: no comment
[[1;33mWARNING[m] public void setType(AuditLogType type) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuditLog.java:79: warning: no comment
[[1;33mWARNING[m] public void setUserId(String userId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:9: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuditLogCriteria {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:25: warning: no comment
[[1;33mWARNING[m] public String getDocumentId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:33: warning: no comment
[[1;33mWARNING[m] public String getUserId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:41: warning: no comment
[[1;33mWARNING[m] public boolean isAdmin() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:45: warning: no comment
[[1;33mWARNING[m] public AuditLogCriteria setAdmin(boolean admin) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:29: warning: no comment
[[1;33mWARNING[m] public void setDocumentId(String documentId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/criteria/AuditLogCriteria.java:37: warning: no comment
[[1;33mWARNING[m] public void setUserId(String userId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/AuditLogDao.java:24: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuditLogDao {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:10: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuditLogDto {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:94: warning: no comment
[[1;33mWARNING[m] public Long getCreateTimestamp() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:70: warning: no comment
[[1;33mWARNING[m] public String getEntityClass() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:62: warning: no comment
[[1;33mWARNING[m] public String getEntityId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:46: warning: no comment
[[1;33mWARNING[m] public String getId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:86: warning: no comment
[[1;33mWARNING[m] public String getMessage() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:78: warning: no comment
[[1;33mWARNING[m] public AuditLogType getType() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:54: warning: no comment
[[1;33mWARNING[m] public String getUsername() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:98: warning: no comment
[[1;33mWARNING[m] public void setCreateTimestamp(Long createTimestamp) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:74: warning: no comment
[[1;33mWARNING[m] public void setEntityClass(String entityClass) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:66: warning: no comment
[[1;33mWARNING[m] public void setEntityId(String entityId) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:50: warning: no comment
[[1;33mWARNING[m] public void setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:90: warning: no comment
[[1;33mWARNING[m] public void setMessage(String message) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:82: warning: no comment
[[1;33mWARNING[m] public void setType(AuditLogType type) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/dao/dto/AuditLogDto.java:58: warning: no comment
[[1;33mWARNING[m] public void setUsername(String username) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/util/AuditLogUtil.java:16: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuditLogUtil {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:19: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AuthenticationToken {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:108: warning: no comment
[[1;33mWARNING[m] public Date getCreationDate() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:63: warning: no comment
[[1;33mWARNING[m] public String getId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:90: warning: no comment
[[1;33mWARNING[m] public String getIp() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:117: warning: no comment
[[1;33mWARNING[m] public Date getLastConnectionDate() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:99: warning: no comment
[[1;33mWARNING[m] public String getUserAgent() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:72: warning: no comment
[[1;33mWARNING[m] public String getUserId() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:81: warning: no comment
[[1;33mWARNING[m] public boolean isLongLasted() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:112: warning: no comment
[[1;33mWARNING[m] public AuthenticationToken setCreationDate(Date creationDate) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:67: warning: no comment
[[1;33mWARNING[m] public AuthenticationToken setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:94: warning: no comment
[[1;33mWARNING[m] public AuthenticationToken setIp(String ip) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-core/src/main/java/com/sismics/docs/core/model/jpa/AuthenticationToken.java:121: warning: no comment
[[1;33mWARNING[m] public AuthenticationToken setLastConnectionDate(Date lastConnectionDate) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] 100 warnings
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m------------------< [0;36mcom.sismics.docs:docs-web-common[0;1m >------------------[m
[[1;34mINFO[m] [1mBuilding Docs Web Commons 1.12-SNAPSHOT                            [3/4][m
[[1;34mINFO[m] [1m--------------------------------[ jar ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m>>> [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m > [0;1mgenerate-sources[m @ [36mdocs-web-common[0;1m >>>[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mjacoco-maven-plugin:0.8.9:prepare-agent[m [1m(default)[m @ [36mdocs-web-common[0;1m ---[m
[[1;34mINFO[m] argLine set to -javaagent:/home/xin_hao/.m2/repository/org/jacoco/org.jacoco.agent/0.8.9/org.jacoco.agent-0.8.9-runtime.jar=destfile=/home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/target/jacoco.exec
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m<<< [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m < [0;1mgenerate-sources[m @ [36mdocs-web-common[0;1m <<<[m
[[1;34mINFO[m] 
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m @ [36mdocs-web-common[0;1m ---[m
[[1;33mWARNING[m] Javadoc Warnings
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/AclUtil.java:19: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class AclUtil {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/AnonymousPrincipal.java:14: warning: no comment
[[1;33mWARNING[m] public static final String ANONYMOUS = "anonymous";
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/AnonymousPrincipal.java:53: warning: no comment
[[1;33mWARNING[m] public void setDateTimeZone(DateTimeZone dateTimeZone) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/CorsFilter.java:15: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class CorsFilter implements Filter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/HeaderBasedSecurityFilter.java:16: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class HeaderBasedSecurityFilter extends SecurityFilter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/listener/IIOProviderContextListener.java:29: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public final class IIOProviderContextListener implements ServletContextListener {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/JwtBasedSecurityFilter.java:44: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class JwtBasedSecurityFilter extends SecurityFilter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/RequestContextFilter.java:29: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class RequestContextFilter implements Filter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/RestUtil.java:20: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class RestUtil {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/SecurityFilter.java:31: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public abstract class SecurityFilter implements Filter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/util/filter/TokenBasedSecurityFilter.java:21: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class TokenBasedSecurityFilter extends SecurityFilter {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:96: warning: no comment
[[1;33mWARNING[m] public Set<String> getBaseFunctionSet() {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:100: warning: no comment
[[1;33mWARNING[m] public void setBaseFunctionSet(Set<String> baseFunctionSet) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:83: warning: no comment
[[1;33mWARNING[m] public void setDateTimeZone(DateTimeZone dateTimeZone) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:92: warning: no comment
[[1;33mWARNING[m] public void setEmail(String email) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:109: warning: no comment
[[1;33mWARNING[m] public void setGroupIdSet(Set<String> groupIdSet) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:65: warning: no comment
[[1;33mWARNING[m] public void setId(String id) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/security/UserPrincipal.java:74: warning: no comment
[[1;33mWARNING[m] public void setName(String name) {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:31: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:48: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:75: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:87: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:98: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:134: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:149: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:175: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:191: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:208: warning: no description for @throws
[[1;33mWARNING[m] * @throws ClientException
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:17: warning: use of default constructor, which does not provide a comment
[[1;33mWARNING[m] public class ValidationUtil {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:163: warning: no comment
[[1;33mWARNING[m] public static void validateRegex(String s, String name, String regex) throws ClientException {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] /home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/src/main/java/com/sismics/rest/util/ValidationUtil.java:157: warning: no comment
[[1;33mWARNING[m] public static void validateUsername(String s, String name) throws ClientException {
[[1;33mWARNING[m] ^
[[1;33mWARNING[m] 31 warnings
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m---------------------< [0;36mcom.sismics.docs:docs-web[0;1m >----------------------[m
[[1;34mINFO[m] [1mBuilding Docs Web 1.12-SNAPSHOT                                    [4/4][m
[[1;34mINFO[m] [1m--------------------------------[ war ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m>>> [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m > [0;1mgenerate-sources[m @ [36mdocs-web[0;1m >>>[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mjacoco-maven-plugin:0.8.9:prepare-agent[m [1m(default)[m @ [36mdocs-web[0;1m ---[m
[[1;34mINFO[m] argLine set to -javaagent:/home/xin_hao/.m2/repository/org/jacoco/org.jacoco.agent/0.8.9/org.jacoco.agent-0.8.9-runtime.jar=destfile=/home/xin_hao/.jenkins/workspace/Teedy/docs-web/target/jacoco.exec
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m<<< [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[0;1m < [0;1mgenerate-sources[m @ [36mdocs-web[0;1m <<<[m
[[1;34mINFO[m] 
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m @ [36mdocs-web[0;1m ---[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1mReactor Summary for Docs Parent 1.12-SNAPSHOT:[m
[[1;34mINFO[m] 
[[1;34mINFO[m] Docs Parent ........................................ [1;32mSUCCESS[m [  0.871 s]
[[1;34mINFO[m] Docs Core .......................................... [1;32mSUCCESS[m [  9.299 s]
[[1;34mINFO[m] Docs Web Commons ................................... [1;32mSUCCESS[m [  3.005 s]
[[1;34mINFO[m] Docs Web ........................................... [1;31mFAILURE[m [  3.288 s]
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1;31mBUILD FAILURE[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] Total time:  17.015 s
[[1;34mINFO[m] Finished at: 2026-05-20T11:44:56+08:00
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;31mERROR[m] Failed to execute goal [32morg.apache.maven.plugins:maven-javadoc-plugin:3.12.0:javadoc[m [1m(default-cli)[m on project [36mdocs-web[m: [1;31mAn error has occurred in Javadoc report generation: [m
[[1;31mERROR[m] [1;31mExit code: 1[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:42: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {put} /acl Add an ACL[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:43: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName PutAcl[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:44: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup Acl[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:45: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} source Source ID[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:46: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String="READ","WRITE"} perm Permission[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:47: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} target Target ID[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:48: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String="USER","GROUP","SHARE"} type Target type[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:49: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} id Acl ID[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:50: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} perm Permission[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:51: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} name Target name[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:52: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String="USER","GROUP","SHARE"} type Target type[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:53: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:54: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ValidationError Validation error[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:55: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) InvalidTarget This target does not exist[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:56: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission user[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:57: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:126: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {delete} /acl/:source/:perm/:target Delete an ACL[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:127: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName DeleteAcl[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:128: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup Acl[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:129: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} source Source ID[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:130: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String="READ","WRITE"} perm Permission[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:131: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} target Target ID[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:132: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} status Status OK[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:133: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:134: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ValidationError Validation error[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:135: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) AclError Cannot delete base ACL on a document or a tag[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:136: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission user[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:137: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:199: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {get} /acl/target/search Search in ACL targets[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:200: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName GetAclTargetSearch[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:201: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup Acl[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:202: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} search Search query[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:203: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {Object[]} users List of users[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:204: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} users.name Username[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:205: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {Object[]} groups List of groups[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:206: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} groups.name Group name[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:207: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:208: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ValidationError Validation error[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:209: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission user[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:210: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AclResource.java:38: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AclResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:63: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {get} /app Get application information[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:64: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName GetApp[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:65: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:66: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} current_version API current version[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:67: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} min_version API minimum version[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:68: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {Boolean} guest_login True if guest login is enabled[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:69: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} default_language Default platform language[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:70: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {Number} queued_tasks Number of queued tasks waiting to be processed[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:71: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} total_memory Allocated JVM memory (in bytes)[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:72: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} free_memory Free JVM memory (in bytes)[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:73: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} document_count Number of documents[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:74: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} active_user_count Number of active users[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:75: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} global_storage_current Global storage currently used (in bytes)[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:76: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} global_storage_quota Maximum global storage (in bytes)[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:77: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission none[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:78: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:120: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {post} /app/guest_login Enable/disable guest login[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:121: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName PostAppGuestLogin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:122: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:123: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {Boolean} enabled If true, enable guest login[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:124: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:125: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission admin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:126: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:148: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {post} /app/ocr Enable/disable OCR[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:149: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName PostAppOcr[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:150: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:151: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {Boolean} enabled If true, enable OCR[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:152: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:153: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission admin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:154: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:176: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {post} /app/config General application configuration[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:177: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName PostAppConfig[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:178: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:179: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} default_language Default language[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:180: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:181: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission admin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:182: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:208: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {get} /app/config_smtp Get the SMTP server configuration[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:209: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName GetAppConfigSmtp[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:210: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:211: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} hostname SMTP hostname[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:212: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} port SMTP port[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:213: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} username SMTP username[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:214: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} password SMTP password[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:215: error: unknown tag: apiSuccess[m
[[1;31mERROR[m] [1;31m     * @apiSuccess {String} from From address[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:216: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:217: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission admin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:218: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:277: error: unknown tag: api[m
[[1;31mERROR[m] [1;31m     * @api {post} /app/config_smtp Configure the SMTP server[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:278: error: unknown tag: apiName[m
[[1;31mERROR[m] [1;31m     * @apiName PostAppConfigSmtp[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:279: error: unknown tag: apiGroup[m
[[1;31mERROR[m] [1;31m     * @apiGroup App[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:280: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} hostname SMTP hostname[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:281: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {Integer} port SMTP port[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:282: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} username SMTP username[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:283: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} password SMTP password[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:284: error: unknown tag: apiParam[m
[[1;31mERROR[m] [1;31m     * @apiParam {String} from From address[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:285: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ForbiddenError Access denied[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:286: error: unknown tag: apiError[m
[[1;31mERROR[m] [1;31m     * @apiError (client) ValidationError Validation error[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:287: error: unknown tag: apiPermission[m
[[1;31mERROR[m] [1;31m     * @apiPermission admin[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:288: error: unknown tag: apiVersion[m
[[1;31mERROR[m] [1;31m     * @apiVersion 1.5.0[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:454: warning: no @param for autoTagsEnabled[m
[[1;31mERROR[m] [1;31m    public Response configInbox(@FormParam("enabled") Boolean enabled,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:454: warning: no @param for deleteImported[m
[[1;31mERROR[m] [1;31m    public Response configInbox(@FormParam("enabled") Boolean enabled,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:454: warning: no @param for starttls[m
[[1;31mERROR[m] [1;31m    public Response configInbox(@FormParam("enabled") Boolean enabled,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AppResource.java:54: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AppResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AuditLogResource.java:57: warning: no @param for documentId[m
[[1;31mERROR[m] [1;31m    public Response list(@QueryParam("document") String documentId) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/AuditLogResource.java:31: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class AuditLogResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/BaseResource.java:28: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic abstract class BaseResource {[m
[[1;31mERROR[m] [1;31m                ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/CommentResource.java:155: warning: no @param for shareId[m
[[1;31mERROR[m] [1;31m    public Response get(@PathParam("documentId") String documentId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/CommentResource.java:25: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class CommentResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocsMessageBodyWriter.java:23: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class DocsMessageBodyWriter implements MessageBodyWriter<JsonObject> {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:177: warning: no @param for files[m
[[1;31mERROR[m] [1;31m    public Response get([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchCreatedAfter[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchCreatedBefore[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchBy[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchFull[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchLang[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchMime[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchShared[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchSimple[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchTag[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchTagNot[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchTitle[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchUpdatedAfter[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchUpdatedBefore[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:429: warning: no @param for searchWorkflow[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchCreatedAfter[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchCreatedBefore[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchBy[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchFull[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchLang[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchMime[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchShared[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchSimple[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchTag[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchTagNot[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchTitle[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchUpdatedAfter[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchUpdatedBefore[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:567: warning: no @param for searchWorkflow[m
[[1;31mERROR[m] [1;31m    public Response listPost([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for id[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for subject[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for identifier[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for publisher[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for format[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for source[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for type[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for coverage[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for rights[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for tagList[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for relationList[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for metadataIdList[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for metadataValueList[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for language[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:781: warning: no @param for createDateStr[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/DocumentResource.java:98: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class DocumentResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/util/DocumentSearchCriteriaUtil.java:23: warning: no comment[m
[[1;31mERROR[m] [1;31mpublic class DocumentSearchCriteriaUtil {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/util/DocumentSearchCriteriaUtil.java:23: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class DocumentSearchCriteriaUtil {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:92: warning: no @param for previousFileId[m
[[1;31mERROR[m] [1;31m    public Response add([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:166: warning: no @param for documentId[m
[[1;31mERROR[m] [1;31m    public Response attach([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:244: warning: no @param for name[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("id") String id,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:568: warning: no @param for shareId[m
[[1;31mERROR[m] [1;31m    public Response data([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:568: warning: no @param for size[m
[[1;31mERROR[m] [1;31m    public Response data([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/FileResource.java:61: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class FileResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:59: warning: no @param for parentName[m
[[1;31mERROR[m] [1;31m    public Response add(@FormParam("parent") String parentName,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:59: warning: no @param for name[m
[[1;31mERROR[m] [1;31m    public Response add(@FormParam("parent") String parentName,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:119: warning: no @param for groupName[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("groupName") String groupName,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:119: warning: no @param for parentName[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("groupName") String groupName,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:119: warning: no @param for name[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("groupName") String groupName,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:190: warning: no @param for groupName[m
[[1;31mERROR[m] [1;31m    public Response delete(@PathParam("groupName") String groupName) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/GroupResource.java:39: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class GroupResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/MetadataResource.java:46: warning: no @param for sortColumn[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/MetadataResource.java:46: warning: no @param for asc[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/MetadataResource.java:26: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class MetadataResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:55: warning: no @param for sortColumn[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:55: warning: no @param for asc[m
[[1;31mERROR[m] [1;31m    public Response list([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:96: warning: no @param for name[m
[[1;31mERROR[m] [1;31m    public Response add(@FormParam("name") String name, @FormParam("steps") String steps) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:96: warning: no @param for steps[m
[[1;31mERROR[m] [1;31m    public Response add(@FormParam("name") String name, @FormParam("steps") String steps) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:282: warning: no @param for id[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("id") String id,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:282: warning: no @param for name[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("id") String id,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:282: warning: no @param for steps[m
[[1;31mERROR[m] [1;31m    public Response update(@PathParam("id") String id,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:329: warning: no @param for id[m
[[1;31mERROR[m] [1;31m    public Response delete(@PathParam("id") String id) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteModelResource.java:35: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class RouteModelResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:54: warning: no @param for routeModelId[m
[[1;31mERROR[m] [1;31m    public Response start(@FormParam("routeModelId") String routeModelId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:54: warning: no @param for documentId[m
[[1;31mERROR[m] [1;31m    public Response start(@FormParam("routeModelId") String routeModelId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:151: warning: no @param for documentId[m
[[1;31mERROR[m] [1;31m    public Response validate(@FormParam("documentId") String documentId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:151: warning: no @param for transitionStr[m
[[1;31mERROR[m] [1;31m    public Response validate(@FormParam("documentId") String documentId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:151: warning: no @param for comment[m
[[1;31mERROR[m] [1;31m    public Response validate(@FormParam("documentId") String documentId,[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:308: warning: no @param for documentId[m
[[1;31mERROR[m] [1;31m    public Response delete(@QueryParam("documentId") String documentId) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/RouteResource.java:33: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class RouteResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/ShareResource.java:31: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class ShareResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/TagResource.java:250: warning: no @param for id[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/TagResource.java:34: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class TagResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/util/TagUtil.java:14: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class TagUtil {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/ThemeResource.java:39: warning: use of default constructor, which does not provide a comment[m
[[1;31mERROR[m] [1;31mpublic class ThemeResource extends BaseResource {[m
[[1;31mERROR[m] [1;31m       ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/UserResource.java:79: warning: no @param for storageQuotaStr[m
[[1;31mERROR[m] [1;31m    public Response register([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/UserResource.java:199: warning: no @param for storageQuotaStr[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/UserResource.java:199: warning: no @param for disabled[m
[[1;31mERROR[m] [1;31m    public Response update([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/UserResource.java:285: warning: no @param for validationCodeStr[m
[[1;31mERROR[m] [1;31m    public Response login([m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m/home/xin_hao/.jenkins/workspace/Teedy/docs-web/src/main/java/com/sismics/docs/rest/resource/UserResource.java:931: warning: no @param for validationCodeStr[m
[[1;31mERROR[m] [1;31m    public Response testTotp(@FormParam("code") String validationCodeStr) {[m
[[1;31mERROR[m] [1;31m                    ^[m
[[1;31mERROR[m] [1;31m100 errors[m
[[1;31mERROR[m] [1;31m100 warnings[m
[[1;31mERROR[m] [1;31mCommand line was: /usr/lib/jvm/java-21-openjdk-amd64/bin/javadoc -J-Duser.language= -J-Duser.country= @options @packages[m
[[1;31mERROR[m] [1;31m[m
[[1;31mERROR[m] [1;31mRefer to the generated Javadoc files in '/home/xin_hao/.jenkins/workspace/Teedy/docs-web/target/reports/apidocs' dir.[m
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
[[1;31mERROR[m]   [1mmvn <args> -rf :docs-web[m
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