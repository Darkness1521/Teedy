+ mvn pmd:pmd -Dpmd.printFailingErrors=false
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
[[1;34mINFO[m] [1m--- [0;32mmaven-pmd-plugin:3.21.2:pmd[m [1m(default-cli)[m @ [36mdocs-parent[0;1m ---[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m---------------------< [0;36mcom.sismics.docs:docs-core[0;1m >---------------------[m
[[1;34mINFO[m] [1mBuilding Docs Core 1.12-SNAPSHOT                                   [2/4][m
[[1;34mINFO[m] [1m--------------------------------[ jar ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-pmd-plugin:3.21.2:pmd[m [1m(default-cli)[m @ [36mdocs-core[0;1m ---[m
[[1;33mWARNING[m] Unable to locate Source XRef to link to - DISABLED
[[1;34mINFO[m] PMD version: 6.55.0
[[1;33mWARNING[m] Discontinue using Rule name category/java/design.xml/ExcessiveMethodLength as it is scheduled for removal from PMD. PMD 7.0.0 will remove support for this Rule.
[[1;33mWARNING[m] Discontinue using Rule name category/java/design.xml/ExcessiveClassLength as it is scheduled for removal from PMD. PMD 7.0.0 will remove support for this Rule.
[[1;33mWARNING[m] Discontinue using Rule name category/java/design.xml/ExcessiveMethodLength as it is scheduled for removal from PMD. PMD 7.0.0 will remove support for this Rule.
[[1;33mWARNING[m] Discontinue using Rule name category/java/design.xml/ExcessiveClassLength as it is scheduled for removal from PMD. PMD 7.0.0 will remove support for this Rule.
[[1;34mINFO[m] Rendering content with [1morg.apache.maven.skins:maven-default-skin:jar:1.3 skin[m.
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m------------------< [0;36mcom.sismics.docs:docs-web-common[0;1m >------------------[m
[[1;34mINFO[m] [1mBuilding Docs Web Commons 1.12-SNAPSHOT                            [3/4][m
[[1;34mINFO[m] [1m--------------------------------[ jar ]---------------------------------[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m--- [0;32mmaven-pmd-plugin:3.21.2:pmd[m [1m(default-cli)[m @ [36mdocs-web-common[0;1m ---[m
[[1;33mWARNING[m] Unable to locate Source XRef to link to - DISABLED
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1mReactor Summary for Docs Parent 1.12-SNAPSHOT:[m
[[1;34mINFO[m] 
[[1;34mINFO[m] Docs Parent ........................................ [1;32mSUCCESS[m [  0.853 s]
[[1;34mINFO[m] Docs Core .......................................... [1;32mSUCCESS[m [  2.131 s]
[[1;34mINFO[m] Docs Web Commons ................................... [1;31mFAILURE[m [  0.173 s]
[[1;34mINFO[m] Docs Web ........................................... [1;33mSKIPPED[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1;31mBUILD FAILURE[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] Total time:  3.606 s
[[1;34mINFO[m] Finished at: 2026-05-20T11:04:12+08:00
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;31mERROR[m] Failed to execute goal [32morg.apache.maven.plugins:maven-pmd-plugin:3.21.2:pmd[m [1m(default-cli)[m on project [36mdocs-web-common[m: [1;31mExecution default-cli of goal org.apache.maven.plugins:maven-pmd-plugin:3.21.2:pmd failed: org.apache.maven.reporting.MavenReportException: Could not find resource '/home/xin_hao/.jenkins/workspace/Teedy/docs-web-common/customize-rules.xml'.[m -> [1m[Help 1][m
[[1;31mERROR[m] 
[[1;31mERROR[m] To see the full stack trace of the errors, re-run Maven with the [1m-e[m switch.
[[1;31mERROR[m] Re-run Maven using the [1m-X[m switch to enable full debug logging.
[[1;31mERROR[m] 
[[1;31mERROR[m] For more information about the errors and possible solutions, please read the following articles:
[[1;31mERROR[m] [1m[Help 1][m http://cwiki.apache.org/confluence/display/MAVEN/PluginExecutionException
[[1;31mERROR[m] 
[[1;31mERROR[m] After correcting the problems, you can resume the build with the command
[[1;31mERROR[m]   [1mmvn <args> -rf :docs-web-common[m
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (JaCoCo)
Stage "JaCoCo" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Javadoc)
Stage "Javadoc" skipped due to earlier failure(s)
[Pipeline] getContext
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