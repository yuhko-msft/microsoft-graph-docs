---
title: "Update directorySettingTemplate"
description: "Update the properties of a directorySettingTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update directorySettingTemplate
Namespace: microsoft.graph



Update the properties of a [directorySettingTemplate](../resources/directorysettingtemplate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /directorySettingTemplates/{directorySettingTemplatesId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directorySettingTemplate](../resources/directorysettingtemplate.md) object.

The following table shows the properties that are required when you update the [directorySettingTemplate](../resources/directorysettingtemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|values|[settingTemplateValue](../resources/settingtemplatevalue.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [directorySettingTemplate](../resources/directorysettingtemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_directorysettingtemplate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/directorySettingTemplates/{directorySettingTemplatesId}
Content-Type: application/json
Content-length: 262

{
  "@odata.type": "#microsoft.graph.directorySettingTemplate",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "values": [
    {
      "@odata.type": "microsoft.graph.settingTemplateValue"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.directorySettingTemplate",
  "id": "6330ac56-ac56-6330-56ac-306356ac3063",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "values": [
    {
      "@odata.type": "microsoft.graph.settingTemplateValue"
    }
  ]
}
```

