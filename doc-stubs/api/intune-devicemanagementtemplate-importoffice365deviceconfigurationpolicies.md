---
title: "deviceManagementTemplate: importOffice365DeviceConfigurationPolicies"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# deviceManagementTemplate: importOffice365DeviceConfigurationPolicies
Namespace: microsoft.graph

**TODO: Add Description**

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /deviceManagement/templates/importOffice365DeviceConfigurationPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [deviceManagementIntent](../resources/intune-devicemanagementintent.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "devicemanagementtemplate_importoffice365deviceconfigurationpolicies"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/templates/importOffice365DeviceConfigurationPolicies
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementIntent)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementIntent",
      "id": "String (identifier)",
      "displayName": "String",
      "description": "String",
      "isAssigned": "Boolean",
      "lastModifiedDateTime": "String (timestamp)",
      "templateId": "String",
      "roleScopeTagIds": [
        "String"
      ]
    }
  ]
}
```

