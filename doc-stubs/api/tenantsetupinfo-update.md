---
title: "Update tenantSetupInfo"
description: "Update the properties of a tenantSetupInfo object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update tenantSetupInfo
Namespace: microsoft.graph



Update the properties of a [tenantSetupInfo](../resources/tenantsetupinfo.md) object.

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
PATCH /tenantSetupInfo
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [tenantSetupInfo](../resources/tenantsetupinfo.md) object.

The following table shows the properties that are required when you update the [tenantSetupInfo](../resources/tenantsetupinfo.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|firstTimeSetup|Boolean|**TODO: Add Description**|
|relevantRolesSettings|String collection|**TODO: Add Description**|
|setupStatus|setupStatus|**TODO: Add Description**. Possible values are: `unknown`, `notRegisteredYet`, `registeredSetupNotStarted`, `registeredSetupInProgress`, `registrationAndSetupCompleted`, `registrationFailed`, `registrationTimedOut`, `disabled`.|
|skipSetup|Boolean|**TODO: Add Description**|
|userRolesActions|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [tenantSetupInfo](../resources/tenantsetupinfo.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_tenantsetupinfo"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/tenantSetupInfo
Content-Type: application/json
Content-length: 227

{
  "@odata.type": "#microsoft.graph.tenantSetupInfo",
  "firstTimeSetup": "Boolean",
  "relevantRolesSettings": [
    "String"
  ],
  "setupStatus": "String",
  "skipSetup": "Boolean",
  "userRolesActions": "String"
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
  "@odata.type": "#microsoft.graph.tenantSetupInfo",
  "id": "343bec25-ec25-343b-25ec-3b3425ec3b34",
  "firstTimeSetup": "Boolean",
  "relevantRolesSettings": [
    "String"
  ],
  "setupStatus": "String",
  "skipSetup": "Boolean",
  "userRolesActions": "String"
}
```

