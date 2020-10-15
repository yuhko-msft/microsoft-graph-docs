---
title: "Update groupSettingTemplate"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update groupSettingTemplate

Namespace: microsoft.graph

Update the properties of a groupSettingTemplate object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [groupSettingTemplate](../resources/-groupsettingtemplate.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a groupSettingTemplate object.

| Property    | Type                                                                    | Description |
| :---------- | :---------------------------------------------------------------------- | :---------- |
| description | String                                                                  |             |
| displayName | String                                                                  |             |
| values      | [settingTemplateValue](../resources/settingtemplatevalue.md) collection |             |

## Response

If successful, this method returns a `200 OK` response code and a groupSettingTemplate object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_groupsettingtemplate"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/groupSettingTemplates/{id}

Content-Type: application/json
Content-Length: 370

{
  "@odata.type": "#microsoft.graph.groupSettingTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "values": [
    {
      "@odata.type": "#microsoft.graph.settingTemplateValue",
      "defaultValue": "String",
      "description": "String",
      "name": "String",
      "type": "String"
    }
  ]
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.groupSettingTemplate"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.groupSettingTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String(identifier)",
  "values": [
    {
      "@odata.type": "#microsoft.graph.settingTemplateValue",
      "defaultValue": "String",
      "description": "String",
      "name": "String",
      "type": "String"
    }
  ]
}
}

```
