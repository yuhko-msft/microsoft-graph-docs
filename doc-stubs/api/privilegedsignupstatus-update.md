---
title: "Update privilegedSignupStatus"
description: "Update the properties of a privilegedSignupStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update privilegedSignupStatus
Namespace: microsoft.graph



Update the properties of a [privilegedSignupStatus](../resources/privilegedsignupstatus.md) object.

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
PATCH /privilegedSignupStatus/{privilegedSignupStatusId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedSignupStatus](../resources/privilegedsignupstatus.md) object.

The following table shows the properties that are required when you update the [privilegedSignupStatus](../resources/privilegedsignupstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isRegistered|Boolean|**TODO: Add Description**|
|status|setupStatus|**TODO: Add Description**. Possible values are: `unknown`, `notRegisteredYet`, `registeredSetupNotStarted`, `registeredSetupInProgress`, `registrationAndSetupCompleted`, `registrationFailed`, `registrationTimedOut`, `disabled`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [privilegedSignupStatus](../resources/privilegedsignupstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_privilegedsignupstatus"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/privilegedSignupStatus/{privilegedSignupStatusId}
Content-Type: application/json
Content-length: 117

{
  "@odata.type": "#microsoft.graph.privilegedSignupStatus",
  "isRegistered": "Boolean",
  "status": "String"
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
  "@odata.type": "#microsoft.graph.privilegedSignupStatus",
  "id": "4548d0ad-d0ad-4548-add0-4845add04845",
  "isRegistered": "Boolean",
  "status": "String"
}
```

