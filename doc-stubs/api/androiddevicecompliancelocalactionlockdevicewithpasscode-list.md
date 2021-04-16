---
title: "List androidDeviceComplianceLocalActionLockDeviceWithPasscodes"
description: "Get a list of the androidDeviceComplianceLocalActionLockDeviceWithPasscode objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidDeviceComplianceLocalActionLockDeviceWithPasscodes
Namespace: microsoft.graph



Get a list of the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androiddevicecompliancelocalactionlockdevicewithpasscode"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode",
      "id": "3da67ba6-7ba6-3da6-a67b-a63da67ba63d",
      "gracePeriodInMinutes": "Integer",
      "passcode": "String",
      "passcodeSignInFailureCountBeforeWipe": "Integer"
    }
  ]
}
```

