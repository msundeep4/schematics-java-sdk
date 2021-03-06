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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getWorkspaceState options.
 */
public class GetWorkspaceStateOptions extends GenericModel {

  protected String wId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;

    private Builder(GetWorkspaceStateOptions getWorkspaceStateOptions) {
      this.wId = getWorkspaceStateOptions.wId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     */
    public Builder(String wId) {
      this.wId = wId;
    }

    /**
     * Builds a GetWorkspaceStateOptions.
     *
     * @return the new GetWorkspaceStateOptions instance
     */
    public GetWorkspaceStateOptions build() {
      return new GetWorkspaceStateOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetWorkspaceStateOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }
  }

  protected GetWorkspaceStateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceStateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The workspace ID for the workspace that you want to query.  You can run the GET /workspaces call if you need to
   * look up the  workspace IDs in your IBM Cloud account.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }
}

