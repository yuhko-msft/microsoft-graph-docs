---
title: "accessPackageAssignment: FilterByCurrentUser"
description: "Retrieve a list of accesspackageassignment objects filtered on currently-logged-in user."
localization_priority: Normal
author: "sbounouh"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# accessPackageAssignment: FilterByCurrentUser
Namespace: microsoft.graph

In [Azure AD entitlement management](../resources/entitlementmanagement-root.md), retrieve a list of [accessPackageAssignment](../resources/accesspackageassignment.md) objects filtered on currently-logged-in user.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|EntitlementManagement.Read.All, EntitlementManagement.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /identityGovernance/entitlementManagement/accessPackageAssignments/FilterByCurrentUser
```

## Function parameters
In the request URL, provide the following query parameters with values.
The following table shows the parameters that can be used with this function.

|Parameter|Type|Description|
|:---|:---|:---|
|on|String|The list of options that can be used to filter on current user. This parameter can take 2 values: `target`, `createdBy`.|

- `target` is used to get the `accessPackageAssignment` objects where the currently-logged-in user is the target.The resulting list includes all the assignments, current and expired, that the caller has across all catalogs and access packages.

- `createdBy` is used to get the `accessPackageAssignment` objects created by the currently-logged-in user.The resulting list includes all the assignments that the caller has created for themselves or on behalf of others (such as in case of admin direct assignment), across all catalogs and access packages.


## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [accessPackageAssignment](../resources/accesspackageassignment.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "accesspackageassignment_filterbycurrentuser"
}
-->
``` http
GET https://graph.microsoft.com/beta/identityGovernance/entitlementManagement/accessPackageAssignments/FilterByCurrentUser(on='parameterValue')
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.accessPackageAssignment)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "id": "String (identifier)",
      "catalogId": "String",
      "accessPackageId": "String",
      "assignmentPolicyId": "String",
      "targetId": "String",
      "assignmentStatus": "String",
      "assignmentState": "String",
      "isExtended": "Boolean",
      "expiredDateTime": "String (timestamp)",
      "schedule": {
        "@odata.type": "microsoft.graph.requestSchedule"
      }
    }
  ]
}
```

