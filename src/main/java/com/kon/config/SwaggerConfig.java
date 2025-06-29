package com.kon.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 스프링 설정 클래스임을 선언
public class SwaggerConfig {

    /**
     * Swagger(OpenAPI) 문서 설정을 커스터마이징하는 빈 생성
     *
     * @return OpenAPI 객체 - 문서 기본 정보 설정
     */
    @Bean  // 스프링 컨테이너에 빈으로 등록
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // API 문서의 메타정보 설정
                .info(new Info()
                        .title("TodoSev API 문서")      // 문서 제목
                        .version("1.0")                 // API 버전
                        .description("🌟 - TodoSev 프로젝트의 Swagger(OpenAPI) 문서입니다.")  // 상세 설명
                );
    }
}