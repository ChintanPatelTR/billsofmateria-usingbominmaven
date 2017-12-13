# Using dependancy Maven BOM

To use Maven BOM just define BOM into parent.
All dependancy versions are defined in BOM itself, so you can add dependencies without specifyinh version information.
Dependencies which are mendatory will be added automatically into your project.

This prjoject use sample maven BOM (https://bitbucket.highq.com/projects/RND/repos/mavenbom/browse)

### Example:
    Step 1. Project defination
    <groupId>hqmavenproj</groupId>
    <artifactId>hqmavenprojms</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    
	Step 3. Define BOM hqmavenprojms as Parent
    <parent>
        <groupId>hqmavenbom</groupId>
        <artifactId>hqmavenbomms</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
	
    Step 2. Import dependancy without version details:
     <dependencies>
        <!-- From hqmavenprojms BOM through Spring BOM -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- From hqmavenprojms BOM through Hibernate BOM -->
        <dependency>
            <groupId>org.hibernate.ogm</groupId>
            <artifactId>hibernate-ogm-infinispan</artifactId>
        </dependency>
        <!-- From hqmavenprojms BOM -->
        <dependency>
            <groupId>org.apache.spark</groupId>
            <artifactId>spark-core_2.11</artifactId>
        </dependency>
    </dependencies>
	