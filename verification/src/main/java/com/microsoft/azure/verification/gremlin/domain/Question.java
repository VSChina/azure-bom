/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.verification.gremlin.domain;

import com.microsoft.spring.data.gremlin.annotation.Vertex;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Vertex
public class Question {

    @Id
    private String id;

    private String url;
}
