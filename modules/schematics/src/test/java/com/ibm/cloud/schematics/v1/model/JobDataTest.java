/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobData model.
 */
public class JobDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobData() throws Throwable {
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobDataActionModel.actionName(), "testString");
    assertEquals(jobDataActionModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .actionJobData(jobDataActionModel)
      .build();
    assertEquals(jobDataModel.jobType(), "repo_download_job");
    assertEquals(jobDataModel.actionJobData(), jobDataActionModel);

    String json = TestUtilities.serialize(jobDataModel);

    JobData jobDataModelNew = TestUtilities.deserialize(json, JobData.class);
    assertTrue(jobDataModelNew instanceof JobData);
    assertEquals(jobDataModelNew.jobType(), "repo_download_job");
    assertEquals(jobDataModelNew.actionJobData().toString(), jobDataActionModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testJobDataError() throws Throwable {
    new JobData.Builder().build();
  }

}