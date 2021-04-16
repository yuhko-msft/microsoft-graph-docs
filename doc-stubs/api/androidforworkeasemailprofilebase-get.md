---
title: "Get androidForWorkEasEmailProfileBase"
description: "Read the properties and relationships of an androidForWorkEasEmailProfileBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidForWorkEasEmailProfileBase
Namespace: microsoft.graph



Read the properties and relationships of an [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md) object.

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
GET ** Entity URI for microsoft.graph.androidForWorkEasEmailProfileBase not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidforworkeasemailprofilebase"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidForWorkEasEmailProfileBase not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkEasEmailProfileBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidForWorkEasEmailProfileBase",
    "id": "f8b5202a-202a-f8b5-2a20-b5f82a20b5f8",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "authenticationMethod": "String",
    "durationOfEmailToSync": "String",
    "emailAddressSource": "String",
    "hostName": "String",
    "requireSsl": "Boolean",
    "usernameSource": "String"
  }
}
```

