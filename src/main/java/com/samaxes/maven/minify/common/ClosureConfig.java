/*
 * Minify Maven Plugin
 * https://github.com/samaxes/minify-maven-plugin
 *
 * Copyright (c) 2009 samaxes.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.samaxes.maven.minify.common;

import java.util.List;

import com.google.javascript.jscomp.CompilationLevel;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SourceMap.Format;

/**
 * <a href="https://developers.google.com/closure/compiler/">Google Closure Compiler</a> configuration.
 */
public class ClosureConfig {

    private final LanguageMode language;

    private final CompilationLevel compilationLevel;

    private final List<SourceFile> externs;

    private final Format sourceMapFormat;

    private final Boolean angularPass;

    private final Boolean useDefaultExterns;

    /**
     * Init Closure Compiler values.
     *
     * @param language the version of ECMAScript used to report errors in the code
     * @param compilationLevel the degree of compression and optimization to apply to JavaScript
     * @param externs preserve symbols that are defined outside of the code you are compiling
     * @param createSourceMap create a source map for the minifed/combined production files
     * @param angularPass use {@code @ngInject} annotation to generate Angular injections
     * @param useDefaultExterns use externs packed with the Google Closure Compiler
     */
    public ClosureConfig(LanguageMode language, CompilationLevel compilationLevel, List<SourceFile> externs,
            boolean createSourceMap, boolean angularPass, boolean useDefaultExterns) {
        this.language = language;
        this.compilationLevel = compilationLevel;
        this.externs = externs;
        this.sourceMapFormat = (createSourceMap) ? SourceMap.Format.V3 : null;
        this.angularPass = angularPass;
        this.useDefaultExterns = useDefaultExterns;
    }

    /**
     * Gets the language.
     *
     * @return the language
     */
    public LanguageMode getLanguage() {
        return language;
    }

    /**
     * Gets the compilationLevel.
     *
     * @return the compilationLevel
     */
    public CompilationLevel getCompilationLevel() {
        return compilationLevel;
    }

    /**
     * Gets the externs.
     *
     * @return the externs
     */
    public List<SourceFile> getExterns() {
        return externs;
    }

    /**
     * Gets the sourceMapFormat.
     *
     * @return the sourceMapFormat
     */
    public Format getSourceMapFormat() {
        return sourceMapFormat;
    }

    /**
     * Gets the angularPass.
     *
     * @return the angularPass
     */
    public Boolean getAngularPass() {
        return angularPass;
    }

    /**
     * Gets the useDefaultExterns.
     *
     * @return the useDefaultExterns
     * */
    public Boolean getUseDefaultExterns() {
        return useDefaultExterns;
    }
}
