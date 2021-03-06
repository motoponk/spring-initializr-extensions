package com.sivalabs.springstarter.extensions;

import com.sivalabs.springstarter.extensions.docker.DockerProjectGenerationConfiguration;
import com.sivalabs.springstarter.extensions.heroku.HerokuProjectGenerationConfiguration;
import com.sivalabs.springstarter.extensions.jenkins.JenkinsProjectGenerationConfiguration;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import io.spring.initializr.generator.spring.build.BuildCustomizer;
import org.springframework.context.annotation.Import;

/**
 * Configuration for {@link BuildCustomizer}s.
 *
 * @author Siva
 */
@ProjectGenerationConfiguration
@Import({
        DockerProjectGenerationConfiguration.class,
        HerokuProjectGenerationConfiguration.class,
        JenkinsProjectGenerationConfiguration.class
})
public class StartProjectGenerationExtensionsConfiguration {

}
