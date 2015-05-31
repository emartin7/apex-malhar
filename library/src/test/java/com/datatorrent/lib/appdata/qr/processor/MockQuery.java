/*
 * Copyright (c) 2015 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datatorrent.lib.appdata.qr.processor;

import com.datatorrent.lib.appdata.schemas.Query;

import java.util.Map;

public class MockQuery extends Query
{
  public MockQuery(String id)
  {
    super(id);
  }

  public MockQuery(String id,
                   String type)
  {
    super(id, type);
  }

  public MockQuery(String id,
                   String type,
                   Map<String, String> schemaKeys)
  {
    super(id, type, schemaKeys);
  }

  public MockQuery(String id,
                   String type,
                   long countdown)
  {
    super(id, type, countdown);
  }

  public MockQuery(String id,
                   String type,
                   long countdown,
                   Map<String, String> schemaKeys)
  {
    super(id, type, countdown, schemaKeys);
  }
}
