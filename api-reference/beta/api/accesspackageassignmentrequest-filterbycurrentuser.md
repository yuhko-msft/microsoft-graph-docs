---
title: "accessPackageAssignmentRequest: FilterByCurrentUser"
description: "Retrieve a list of accesspackageassignmentrequest objects filtered on currently-logged-in user."
localization_priority: Normal
author: "sbounouh"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# accessPackageAssignmentRequest: FilterByCurrentUser
Namespace: microsoft.graph

In [Azure AD entitlement management](../resources/entitlementmanagement-root.md), retrieve a list of [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) objects filtered on currently-logged-in user.

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
GET /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/FilterByCurrentUser
```

## Function parameters
In the request URL, provide the following query parameters with values.
The following table shows the parameters that can be used with this function.

|Parameter|Type|Description|
|:---|:---|:---|
|on|String|The list of options that can be used to filter on current user. This parameter can take 3 values: `target`, `createdBy` and `approver` |

- `target` is used to get the `accessPackageAssignmentRequest` objects where the currently-logged-in user is the target. The resulting list includes all the assignment requests, current and expired, that were requested by the called or for the caller, across all catalogs and access packages.

- `createdBy` is used to get the `accessPackageAssignmentRequest` objects created by the currently-logged-in user. The resulting list includes all the assignment requests that the caller has created for themselves or on behalf of others (such as in case of admin direct assignment), across all catalogs and access packages.

- `approver` is used to get the `accessPackageAssignmentRequest` objects where the currently-logged-in user is an allowed approver in any contained `accessPackageAssignment/accessPackageAssignmentPolicy/requestApprovalSettings/approvalStages` (`primaryApprovers` or `escalationApprovers`). The resulting list includes the assignment requests in *pending* state, across all catalogs and access packages and that need a decision from the caller. This list does not contain assignment requests in other states than *pending* nor assignment requests that do not require action from the logged-in user.

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "accesspackageassignmentrequest_filterbycurrentuser"
}
-->
``` http
GET https://graph.microsoft.com/beta/identityGovernance/entitlementManagement/accessPackageAssignmentRequests/FilterByCurrentUser(on='parameterValue')
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.accessPackageAssignmentRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "id": "String (identifier)",
      "requestType": "String",
      "requestState": "String",
      "requestStatus": "String",
      "isValidationOnly": "Boolean",
      "createdDateTime": "String (timestamp)",
      "completedDate": "String (timestamp)",
      "expirationDateTime": "String (timestamp)",
      "justification": "String",
      "schedule": {
        "@odata.type": "microsoft.graph.requestSchedule"
      },
      "answers": [
        {
          "@odata.type": "microsoft.graph.accessPackageAnswerString"
        }
      ]
    }
  ]
}
```

