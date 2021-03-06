#pragma once
#include "../../Base/MojingTypes.h"
#ifdef MJ_OS_ANDROID
// from gvrtyprs.h
typedef struct gvr_context_ gvr_context;
typedef struct gvr_clock_time_point 
{
	int64_t monotonic_system_time_nanos;
} gvr_clock_time_point;
// end gvrtyprs.h

typedef struct gvr_mat4f
{
	float m[4][4];
} gvr_mat4f;

#define FN_gvr_get_head_space_from_start_space_rotation "gvr_get_head_space_from_start_space_rotation"
typedef gvr_mat4f (*FP_gvr_get_head_space_from_start_space_rotation)(const gvr_context *gvr, const gvr_clock_time_point time);

#define FN_gvr_reset_tracking "gvr_reset_tracking"
typedef void (*FP_gvr_reset_tracking)(const gvr_context *gvr);


#define FN_gvr_get_viewer_model "gvr_get_viewer_model"
typedef const char *(*FP_gvr_get_viewer_model)(const gvr_context *gvr);

#define FN_gvr_get_viewer_vendor "gvr_get_viewer_model"
typedef const char *(*FP_gvr_get_viewer_vendor)(const gvr_context *gvr);


class HookGVRTools
{
public:
	HookGVRTools();
	virtual ~HookGVRTools();
	static bool Init();
private:
	static bool LoadGVR();
	static gvr_mat4f HOOK_gvr_get_head_space_from_start_space_rotation(const gvr_context *gvr, const gvr_clock_time_point time);
	static void HOOK_gvr_reset_tracking(const gvr_context *gvr);
	static void * m_hGVR;
	static FP_gvr_get_head_space_from_start_space_rotation m_fp_gvr_get_head_space_from_start_space_rotation;
	static FP_gvr_reset_tracking m_fp_gvr_reset_tracking;

	static FP_gvr_get_viewer_model m_fp_gvr_get_viewer_model;
	static FP_gvr_get_viewer_vendor m_fp_gvr_get_viewer_vendor;
};

#endif